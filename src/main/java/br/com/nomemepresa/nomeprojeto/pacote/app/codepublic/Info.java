package br.com.nomemepresa.nomeprojeto.pacote.app.codepublic;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target() Especifica o tipo de elemento que vai ser (elemento, objeto, variavel, construtor)
//@Retention()  Especifica se ela vai restringir para um codigo fonte ou momento de runtime
public @interface Info {

    String createdBy() default "Mauricio";



}
