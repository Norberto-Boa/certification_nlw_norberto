package com.anytechsols.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anytechsols.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.anytechsols.certification_nlw.modules.students.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

  // Import the service
  @Autowired
  private StudentService studentService;

  @PostMapping("/verifyIfHasCertification")
  public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
    var result = this.studentService.verifyIfUserHasCertification(verifyHasCertificationDTO);

    if (result) {
      return "He cannot do it";
    }

    return "He can do it";
  }

}
