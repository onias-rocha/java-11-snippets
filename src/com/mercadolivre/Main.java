package com.mercadolivre;

import com.mercadolivre.snippets.SnippetMethods;

public class Main {

    public static void main(String[] args) {
        String linesEx = "Hi\nHello\rWassup";
        String stripEx ="   Hello,  \tWorld\t";
        String repeatEx = "Teste";

//        SnippetMethods.stripSnippets(stripEx);
//        SnippetMethods.repeatSnippet(repeatEx, 4);
        SnippetMethods.localVariableForLambdaSnippets(1,2);
    }
}
