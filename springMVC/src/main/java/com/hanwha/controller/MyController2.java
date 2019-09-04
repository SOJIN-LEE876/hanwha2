package com.hanwha.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hanwha.model.DeptDAO_Mybatis;
import com.hanwha.model.DeptDTO;
import com.hanwha.model.EmpService;
import com.hanwha.model.EmpVO;

//<bean id="myController" class="">
@Controller
public class MyController2 {
	// DeptDAO dao = new DeptDAO();
	// <bean id="dao" class="com.hanwha.model2.DeptDAO"/>
	// <bean id="myController" class="">
	// <property name = "dao" ref="dao">
	@Autowired
	// DeptDAO dao;
	DeptDAO_Mybatis dao;

	@Autowired
	EmpService service;

	@RequestMapping("/404")
	public String error404(Model model) {
		model.addAttribute("company", "한화ICT");
		model.addAttribute("manager", "이소진");
		return "error404";
	}

	/*
	 * @RequestMapping("/500") public String error500(Model model) {
	 * model.addAttribute("company", "한화ICT"); model.addAttribute("manager", "이소진");
	 * model.addAttribute("phone", "010-0000-0000"); return "error500"; }
	 */

	@ExceptionHandler(Exception.class)
	public String error500(Exception ex, Model model) {
		model.addAttribute("company", "한화ICT");
		model.addAttribute("manager", "이소진");
		model.addAttribute("phone", "010-0000-0000");
		model.addAttribute("errormessage", ex.getMessage());
		return "error500";
	}

	@RequestMapping("/emp/emplist")
	public ModelAndView empselectAll() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("emplist", service.selectAll());
		mv.setViewName("emp/emplist");
		return mv;
	}

	@RequestMapping(value = "/emp/empdetail", method = RequestMethod.GET)
	public ModelAndView selectEmpDetail(int empid) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("emp", service.selectById(empid));
		mv.addObject("mlist", service.selectAllManager());
		mv.addObject("joblist", service.selectAllJob());
		mv.addObject("deptlist", dao.selectAll());
		mv.setViewName("emp/empdetail");
		return mv;
	}

	@RequestMapping(value = "/emp/empdetail", method = RequestMethod.POST)
	public String empUpdate(EmpVO emp) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("emplist", service.updateEmp(emp));

		return "redirect:emplist";
	}

	@RequestMapping(value = "/emp/empinsert", method = RequestMethod.GET)
	public ModelAndView empinsertGet() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("deptlist", dao.selectAll());
		mv.addObject("joblist", service.selectAllJob());
		mv.addObject("mlist", service.selectAllManager());
		mv.setViewName("emp/empinsert");
		return mv;

	}

	@RequestMapping(value = "/emp/empinsert", method = RequestMethod.POST)
	public String empinsertPost(EmpVO emp) {
		service.insertEmp(emp);
		return "redirect:emplist";
	}

	@RequestMapping("/emp/empdelete")
	public String empDelete(int empid) {
		service.deleteEmp(empid);
		return "redirect:emplist";
	}

	@RequestMapping("/dept/deptlist")
	public String deptlist(Model model) {
		model.addAttribute("deptlist", dao.selectAll());
		return "dept/deptlist";
	}

	@RequestMapping(value = "/dept/deptdetail", method = RequestMethod.GET)
	public String deptdetailGet(int deptid, Model model) {
		model.addAttribute("dept", dao.selectById(deptid));
		return "dept/deptdetail";
	}

	@RequestMapping(value = "/dept/deptdetail", method = RequestMethod.POST)
	public String deptdetailPost(DeptDTO dept) {
		dao.updateDept(dept);
		return "redirect:deptlist";
	}

	@RequestMapping(value = "/dept/deptinsert", method = RequestMethod.GET)
	public String deptinsertGet() {

		return "dept/deptinsert";
	}

	@RequestMapping(value = "/dept/deptinsert", method = RequestMethod.POST)
	public String deptinsertPost(DeptDTO dept, HttpServletRequest request) {
		MultipartFile uploadfile = dept.getUploadfile();
		if (uploadfile == null)
			return "redirect:deptinsert";

		String path = request.getSession().getServletContext().getRealPath("/resources");
		System.out.println("웹서버의 실제경로:" + path);
		String fileName = uploadfile.getOriginalFilename();
		String fpath = path + "\\" + fileName;
		dept.setFileName(fileName);
		try {
			// 2. File 사용
			File file = new File(fpath);
			uploadfile.transferTo(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insertDept(dept);
		return "redirect:deptlist";
	}

	
	@RequestMapping("/dept/deptdownload")
	public void download(String forder, String file, HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		response.setHeader("Content-Disposition", "attachment;filename="+file);
		String fullPath = request.getSession().getServletContext().getRealPath(forder + "/" + file);
		FileInputStream fi = new FileInputStream(fullPath);
		ServletOutputStream sout = response.getOutputStream();
		byte[] buf = new byte[1024];
		int size = 0;
		while ((size = fi.read(buf, 0, 1024)) != -1) {
			sout.write(buf, 0, size);
		}
		fi.close();
		sout.close();
	}

	@RequestMapping("/dept/deptdelete")
	public String deptDelete(int deptid) {
		dao.deleteDept(deptid);
		return "redirect:deptlist";
	}

}
