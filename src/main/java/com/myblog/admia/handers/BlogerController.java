package com.myblog.admia.handers;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.myblog.admia.mode.Bloger;
import com.myblog.admia.service.BlogerServiceimpl;
import com.myblog.admia.service.SortServiceimpl;

@Controller
@RequestMapping("/bloger")
public class BlogerController {
	
	@Resource(name="blogerService")
	private BlogerServiceimpl blogerService;
	@Resource(name="sortService")
	private SortServiceimpl sortService;
	
	@RequestMapping("/login.do")/*测试*/
	public String login(Model model,HttpSession httpSession,int bloger_id,String bloger_pas) {
		Bloger bloger=blogerService.getBlogerPas(bloger_id);
		System.out.println(bloger);
		if (bloger!=null&&bloger.getBloger_id().equals(bloger_id)&&bloger.getBloger_pas().equals(bloger_pas)) {
			model.addAttribute(bloger);
			httpSession.setAttribute("bloger", bloger);
			return "/welcomeBloger.jsp";
		}
		else {
			return "/error.jsp";
		}
		
		
	}
	
	/*用于登录*/
	@RequestMapping("/blogerlogin.do")
	public String blogerlogin(Model model,HttpSession httpSession,int bloger_id,String bloger_pas) {
		Bloger bloger=blogerService.getBlogerPas(bloger_id);
		System.out.println(bloger);
		if (bloger!=null&&bloger.getBloger_id().equals(bloger_id)&&bloger.getBloger_pas().equals(bloger_pas)) {
			model.addAttribute(bloger);
			httpSession.setAttribute("blogerlogin", bloger);
			return "redirect:/bloger.jsp";
		}
		else {
			return "/error.jsp";
		}
	}
	
	
	
	/*用于跳转*/
	@RequestMapping("/f{symbolicName}.do")
	public String rString(@PathVariable("symbolicName")String symbolicName) {
		
		System.out.println(symbolicName);
		return "/WEB-INF/bloger/"+symbolicName+".jsp";
		
	    }
	
  
	  @RequestMapping(value="/addsort.do",produces = "text/html; charset=utf-8")
	  public @ResponseBody String addsort(String sort_article_name)throws IOException
	  {
		  String result;
		  if(sortService.addsort(sort_article_name)==1)
		  {
			  result= "添加成功";
			  
		  }
		  else
		  result= "添加失败";
		  
		  return JSON.toJSONString(result);
	  }

	public BlogerServiceimpl getBlogerService() {
		return blogerService;
	}

	public void setBlogerService(BlogerServiceimpl blogerService) {
		this.blogerService = blogerService;
	}

	public SortServiceimpl getSortService() {
		return sortService;
	}

	public void setSortService(SortServiceimpl sortService) {
		this.sortService = sortService;
	}
	
	

}
