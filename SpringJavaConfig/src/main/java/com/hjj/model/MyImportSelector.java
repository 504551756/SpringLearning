package com.hjj.model;

import com.hjj.SecondJavaConfig;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

@Component
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {

		return new String[]{Student.class.getName(), "com.hjj.model.Teacher", SecondJavaConfig.class.getName(),MyImportBeanDefinitionRegistrar.class.getName()};
	}
}
