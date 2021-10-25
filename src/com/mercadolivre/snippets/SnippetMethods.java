package com.mercadolivre.snippets;

import java.util.List;
import java.util.stream.Collectors;

public class SnippetMethods {
    public static void main(String[] args) {

    }

//New utility methods in String class

    public static void isBlankSnippet(String string){
//        isBlank(): This method returns true if the string is empty or contains only white spaces code points.
        System.out.println(string.isBlank());
    }

    public static void linesSnippet(String string){
//        lines(): This method returns a stream of lines extracted from the string,
//        separated by line terminators such as \n, \r etc.
        List lines = string.lines().collect(Collectors.toList());
        System.out.println(lines);
        System.out.println(string.lines().collect(Collectors.toList()).size());
    }

    public static void stripSnippets(String string){
//        strip(), stripLeading(), stripTrailing(): These methods are used to strip
//        whitespaces from the string. As the name suggests, strip() will remove leading
//        and trailing whitespaces. However, stripLeading() will remove only leading
//        whitespaces and stripTrailing() will remove only trailing whitespaces.
        System.out.println("|" +"Sem Strip Method: " + string+ "|");
        System.out.println("|" +"Strip: " + string.strip()+ "|");
        System.out.println("|" +"Strip Leading: " + string.stripLeading()+ "|");
        System.out.println("|" + "Strip Trailing: " + string.stripTrailing() + "|");
    }

    public static void repeatSnippet(String string, int repetition){
//        repeat(int n): This method returns a new string whose value is the concatenation
//        of this string repeated ‘n’ times.
        System.out.println(string.repeat(repetition));
    }

//Local Variable Syntax for Lambda Parameters
    public static void localVariableForLambdaSnippets(int primeiro, int segundo){
        FuncInter func = (var a, var b) -> a * b;

        System.out.println(func.soma(primeiro,segundo));
    }
}

interface FuncInter {
    int soma(int a, int b);
}
