package br.com.nomemepresa.nomeprojeto.pacote.app;

import br.com.nomemepresa.nomeprojeto.pacote.app.codeprivate.cprivate;
import br.com.nomemepresa.nomeprojeto.pacote.app.codepublic.cpublic;
import codeprotected.cprotected;

public class App{

    public static void main( String[] args )
    {
        //new Main();
        new cpublic();
        new cprivate();
        new cprotected();
        System.out.println( "Hello World!" );

    }
}

