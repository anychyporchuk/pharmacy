package org.rainbow.pharmacy.service;

import javax.swing.JOptionPane;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
public class AOPTest {
	@Pointcut("execution(* org.rainbow.pharmacy.service.MedicamentService.getAllMedicaments(..))")
	public void sfd(){}
	

	@Before("sfd()")
	public void method(){
		//JOptionPane.showMessageDialog(null, "gyh", "Ошибка 'getAll'", JOptionPane.OK_OPTION);
	}

}
