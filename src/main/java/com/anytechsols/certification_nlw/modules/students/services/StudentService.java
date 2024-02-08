package com.anytechsols.certification_nlw.modules.students.services;

import org.springframework.stereotype.Service;

import com.anytechsols.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class StudentService {

  public boolean verifyIfUserHasCertification(VerifyHasCertificationDTO dto) {
    if (dto.getEmail().equals("bate@gmail.com") && dto.getTechnology().equals(("HTML"))) {
      return true;
    }
    return false;
  }
}
