package Controller;

import Database.Data;
import Models.Student;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class Controller {

    Data database = new Data();
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    ModelAndView mav = new ModelAndView();
    List<Student> students = (List<Student>) database.students();
    int id;
    List datos = new ArrayList();

    @RequestMapping("index.htm")
    public ModelAndView listStudent() {
        mav.addObject("list", students);
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value = "add.htm", method = RequestMethod.GET)
    public ModelAndView addStudent() {
        mav.addObject(new Student());
        mav.setViewName("add");
        return mav;
    }

    @RequestMapping(value = "add.htm", method = RequestMethod.POST)
    public ModelAndView addStudent(Student s) {
        System.out.println(s.getId());
        database.addStudent(s);
        return new ModelAndView("redirect:/index.htm");
    }

    @RequestMapping(value = "editStudent.htm", method = RequestMethod.GET)
    public ModelAndView editStudent(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        for (Student st : students) {
            if (st.getId() == id) {
                datos.add(st.id);
                datos.add(st.firstname);
                datos.add(st.lastname);
            }
        }
        mav.addObject("list", datos);
        mav.setViewName("editStudent");
        return mav;
    }

    @RequestMapping(value = "editStudent.htm", method = RequestMethod.POST)
    public ModelAndView editStudent(Student s) {
        for (Student st : students) {
            if (st.getId() == s.getId()) {
                st.setId(id);
                st.setFirstname(s.getFirstname());
                st.setLastname(s.getLastname());
            }
        }
        return new ModelAndView("redirect:/index.htm");
    }

    @RequestMapping(value = "delete.htm")
    public ModelAndView delete(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        int position = 0;
        for (Student st : students) {
            
            if (st.getId() == id) {
                position++;
            }
        }
        students.remove(position);
        return new ModelAndView("redirect:/index.htm");
    }
}
