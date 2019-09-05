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

import com.hanwha.model.MemberService;
import com.hanwha.model.MemberVO;
import com.hanwha.model.ScheduleDAO_Mybatis;
import com.hanwha.model.AssignmentDAO_Mybatis;
import com.hanwha.model.AssignmentDTO;


@Controller
public class MyController {

	@Autowired
	AssignmentDAO_Mybatis dao2;
	
	@Autowired
	ScheduleDAO_Mybatis dao;

	@Autowired
	MemberService service;

	@RequestMapping("/404")
	public String error404(Model model) {
		model.addAttribute("company", "한화ICT");
		model.addAttribute("manager", "이소진");
		return "error404";
	}

	@ExceptionHandler(Exception.class)
	public String error500(Exception ex, Model model) {
		model.addAttribute("company", "한화ICT");
		model.addAttribute("manager", "이소진");
		model.addAttribute("phone", "010-0000-0000");
		model.addAttribute("errormessage", ex.getMessage());
		return "error500";
	}
	
	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}
	

	
	@RequestMapping("/homeintro/intro")
	public String intro() {
	
		return "homeintro/intro";
	}
	@RequestMapping("/homeintro/goal")
	public String goal() {
	
		return "homeintro/goal";
	}

	@RequestMapping("/member/memberlist")
	public ModelAndView memberselectAll() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("memberlist", service.selectAll());
		mv.setViewName("member/memberlist");
		return mv;
	}
	
	@RequestMapping(value = "/member/memberdetail", method = RequestMethod.GET)
	public ModelAndView selectMemberDetail(int memberid) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("member", service.selectById(memberid));
		mv.addObject("mlist", service.selectAllManager());
		mv.addObject("schedulelist", dao.selectAll());
		mv.setViewName("member/memberdetail");
		return mv;
	}

	@RequestMapping(value = "/member/memberdetail", method = RequestMethod.POST)
	public String memberUpdate(MemberVO member) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("memberlist", service.updateMember(member));

		return "redirect:memberlist";
	}

	@RequestMapping(value = "/member/memberinsert", method = RequestMethod.GET)
	public ModelAndView memberinsertGet() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("schedulelist", dao.selectAll());
		mv.addObject("mlist", service.selectAllManager());
		mv.setViewName("member/memberinsert");
		return mv;

	}

	@RequestMapping(value = "/member/memberinsert", method = RequestMethod.POST)
	public String memberinsertPost(MemberVO member) {
		service.insertMember(member);
		return "redirect:memberlist";
	}

	@RequestMapping("/member/memberdelete")
	public String memberDelete(int memberid) {
		service.deleteMember(memberid);
		return "redirect:memberlist";
	}

	@RequestMapping("/schedule/schedulelist")
	public String schedulelist(Model model) {
		model.addAttribute("schedulelist", dao.selectAll());
		return "schedule/schedulelist";
	}
	
	
	
	@RequestMapping("/member/assignmentlist")
	public String membertoassignmentlist(Model model) {
		model.addAttribute("assignmentlist", dao2.selectAll());
		return "assignment/assignmentlist";
	}
	
	@RequestMapping("/member/assignmentlistbyid")
	public String membertoassignmentlistbyid(Integer assignmentid,Model model) {
		model.addAttribute("assignmentlistbyid", dao2.selectAllbyId(assignmentid));
		return "assignment/assignmentlistbyid";
	}


	@RequestMapping(value="/member/assignmentinsert", method=RequestMethod.GET) //���� �����ָ� �� ->page�� return 
	public String membertoassignmentInsertGet() { 
		return "assignment/assignmentinsert"; 
	}


	@RequestMapping(value = "/member/assignmentinsert", method = RequestMethod.POST)
	public String membertoassignmentInsertPost(AssignmentDTO assignment, HttpServletRequest request) {
		
		 MultipartFile uploadfile1 = assignment.getUploadfile1();    
		 MultipartFile uploadfile2 = assignment.getUploadfile2();
		 MultipartFile uploadfile3 = assignment.getUploadfile3();
		 if (uploadfile1 == null || uploadfile2 == null || uploadfile3 ==null) 
			 return "redirect:assignmentinsert";     
		 
		 String path = request.getSession().getServletContext().getRealPath("resources"); 
		
		 String fileName1 = uploadfile1.getOriginalFilename(); 
	
		 assignment.setFileName1(fileName1);  
		 
		 String fileName2 = uploadfile2.getOriginalFilename(); 
		
		 assignment.setFileName2(fileName2);   
		 
		 String fileName3 = uploadfile3.getOriginalFilename();
		
		 assignment.setFileName3(fileName3);   
		 
		 String fpath1 = path +"\\" + fileName1 ;  
		 String fpath2 = path +"\\" + fileName2 ; 
		 String fpath3 = path +"\\" + fileName3 ; 
		 try {                                                   
			 
			 File file1 = new File(fpath1); 
			 File file2 = new File(fpath2); 
			 File file3 = new File(fpath3); 
			 
			 uploadfile1.transferTo(file1);
			 uploadfile2.transferTo(file2);
			 uploadfile3.transferTo(file3);
			 
		} catch (IOException e) {     e.printStackTrace();     } 
		 
		dao2.insertAssignment(assignment);
		
		return "redirect:assignmentlist";
	}

	
	@RequestMapping("/member/assignmentdownload")
	public void membertodownload(String folder, String file, 
			HttpServletRequest request,
			HttpServletResponse response) throws IOException   {
		response.setHeader("Content-Disposition", "attachment;filename=" + file);
		String fullPath = request.getSession().getServletContext().getRealPath(folder + "/" + file);
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
	
	
	@RequestMapping("/member/assignmentdelete")
	public String assignmentDelete(String week, int assignment_id) {
		
		AssignmentDTO dto = new AssignmentDTO();
		dto.setWeek(week);
		dto.setAssignment_id(assignment_id);
		dao2.deleteAssignment(dto);
		
		return "redirect:assignmentlist";
	} 
	
	@RequestMapping(value = "/member/assignmentdetail", method = RequestMethod.GET)
	public String membertoassignmentDetail(String week,int assignment_id,Model model) {
		AssignmentDTO dto = new AssignmentDTO();
		dto.setWeek(week);
		dto.setAssignment_id(assignment_id);
		model.addAttribute("assignment",dao2.selectByIdandWeek(dto));
		return "assignment/assignmentdetail";
	}

	
	@RequestMapping(value = "/member/assignmentdetail", method = RequestMethod.POST)
	public String membertoassignmentDetailPost(AssignmentDTO dto) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("assignmentlist", dao2.updateAssignment(dto));
		return "redirect:assignmentlist";
	}
	
}



