package org.jsp.dao;

import org.jsp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class UserDao {
	@Autowired
private UserDao dao;
	@RequestMapping(value="/save")
public ModelAndView saveUser(@ModelAttribute User user, ModelAndView view) {
	view.setViewName("print.jsp");
//	user=dao.saveUser(user);
	view.addObject("msg","user saved with id:"+user.getId());
	return view;
	
}
}
