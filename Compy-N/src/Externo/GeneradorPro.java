/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Externo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class GeneradorPro {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int estado = 0;
        File file = new File("C:\\Users\\Usuario\\Desktop\\N-compy\\Produ.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int f = 0;
        while ((st = br.readLine()) != null) {
            f++;
        }
        String[] texto = new String[f];
        f = 0;
        br = new BufferedReader(new FileReader(file));
        while ((st = br.readLine()) != null) {
            texto[f++] = st;
        }
        int h = 0;
        for (int j = 0; j < f; j++) {
            String[] lexema = texto[h++].trim().split(" ");
            String[] produccion = new String[lexema.length];
            for (int i = 2; i < lexema.length; i++) {
                switch (lexema[i].trim()) {
                    case "PROGRAMA":
                        estado = 0;
                        break;
                    case "A1":
                        estado = 1;
                        break;
                    case "B1":
                        estado = 2;
                        break;
                    case "C1":
                        estado = 3;
                        break;
                    case "D1":
                        estado = 4;
                        break;
                    case "E1":
                        estado = 5;
                        break;
                    case "F1":
                        estado = 6;
                        break;
                    case "TIPO":
                        estado = 7;
                        break;
                    case "A2":
                        estado = 8;
                        break;
                    case "B2":
                        estado = 9;
                        break;
                    case "C2":
                        estado = 10;
                        break;
                    case "LISTADEPARAMETROS":
                        estado = 11;
                        break;
                    case "A3":
                        estado = 12;
                        break;
                    case "B3":
                        estado = 13;
                        break;
                    case "DECLRACIONCONSTANTE":
                        estado = 14;
                        break;
                    case "A4":
                        estado = 15;
                        break;
                    case "B4":
                        estado = 16;
                        break;
                    case "CONSTANTESSIGNO":
                        estado = 17;
                        break;
                    case "A5":
                        estado = 18;
                        break;
                    case "ESTATUTOS":
                        estado = 19;
                        break;
                    case "A6":
                        estado = 20;
                        break;
                    case "B6":
                        estado = 21;
                        break;
                    case "C6":
                        estado = 22;
                        break;
                    case "D6":
                        estado = 23;
                        break;
                    case "E6":
                        estado = 24;
                        break;
                    case "F6":
                        estado = 25;
                        break;
                    case "G6":
                        estado = 26;
                        break;
                    case "H6":
                        estado = 27;
                        break;
                    case "I6":
                        estado = 28;
                        break;
                    case "J6":
                        estado = 29;
                        break;
                    case "K6":
                        estado = 30;
                        break;
                    case "L6":
                        estado = 31;
                        break;
                    case "M6":
                        estado = 32;
                        break;
                    case "N6":
                        estado = 33;
                        break;
                    case "O6":
                        estado = 34;
                        break;
                    case "P6":
                        estado = 35;
                        break;
                    case "EXPPASCAL":
                        estado = 36;
                        break;
                    case "A7":
                        estado = 37;
                        break;
                    case "B7":
                        estado = 38;
                        break;
                    case "SIMPLEEXPPASCAL":
                        estado = 39;
                        break;
                    case "A8":
                        estado = 40;
                        break;
                    case "B8":
                        estado = 41;
                        break;
                    case "C8":
                        estado = 42;
                        break;
                    case "ARREGLO":
                        estado = 43;
                        break;
                    case "A9":
                        estado = 44;
                        break;
                    case "TERMINOPASCAL":
                        estado = 45;
                        break;
                    case "A10":
                        estado = 46;
                        break;
                    case "B10":
                        estado = 47;
                        break;
                    case "FACTORPASCAL":
                        estado = 48;
                        break;
                    case "A11":
                        estado = 49;
                        break;
                    case "B11":
                        estado = 50;
                        break;
                    case "C11":
                        estado = 51;
                        break;
                    case "D11":
                        estado = 52;
                        break;
                    case "E11":
                        estado = 53;
                        break;
                    case "F11":
                        estado = 54;
                        break;
                    case "FUNCIONES":
                        estado = 55;
                        break;
                    case "A12":
                        estado = 56;
                        break;
                    case "ASIGNACION":
                        estado = 57;
                        break;
                    case "A13":
                        estado = 58;
                        break;
                    case "if":
                        estado = -200;
                        break;
                    case "then":
                        estado = -201;
                        break;
                    case "while":
                        estado = -202;
                        break;
                    case "do":
                        estado = -203;
                        break;
                    case "for":
                        estado = -204;
                        break;
                    case "func":
                        estado = -205;
                        break;
                    case "Proc":
                        estado = -206;
                        break;
                    case "switch":
                        estado = -207;
                        break;
                    case "INT":
                        estado = -208;
                        break;
                    case "String":
                        estado = -209;
                        break;
                    case "float":
                        estado = -210;
                        break;
                    case "REAL":
                        estado = -211;
                        break;
                    case "BOOL":
                        estado = -212;
                        break;
                    case "true":
                        estado = -213;
                        break;
                    case "false":
                        estado = -214;
                        break;
                    case "main":
                        estado = -215;
                        break;
                    case "reg":
                        estado = -216;
                        break;
                    case "CHAR":
                        estado = -217;
                        break;
                    case "EXP":
                        estado = -218;
                        break;
                    case "VOID":
                        estado = -219;
                        break;
                    case "FILE":
                        estado = -220;
                        break;
                    case "else":
                        estado = -221;
                        break;
                    case "repeat":
                        estado = -222;
                        break;
                    case "until":
                        estado = -223;
                        break;
                    case "case":
                        estado = -224;
                        break;
                    case "default":
                        estado = -225;
                        break;
                    case "break":
                        estado = -226;
                        break;
                    case "return":
                        estado = -227;
                        break;
                    case "clean":
                        estado = -244;
                        break;
                    case "sqrt":
                        estado = -228;
                        break;
                    case "sqr":
                        estado = -229;
                        break;
                    case "sqrtv":
                        estado = -230;
                        break;
                    case "pow":
                        estado = -231;
                        break;
                    case "ins":
                        estado = -232;
                        break;
                    case "conv":
                        estado = -233;
                        break;
                    case "up":
                        estado = -234;
                        break;
                    case "low":
                        estado = -235;
                        break;
                    case "len":
                        estado = -236;
                        break;
                    case "asc":
                        estado = -237;
                        break;
                    case "val":
                        estado = -238;
                        break;
                    case "setcolorf":
                        estado = -239;
                        break;
                    case "setcolorb":
                        estado = -240;
                        break;
                    case "getcolorf":
                        estado = -241;
                        break;
                    case "getcolorb":
                        estado = -242;
                        break;
                    case "REG":
                        estado = -243;
                        break;
                    case "id":
                        estado = -100;
                        break;// //
                    case "/":
                        estado = -101;
                        break;// /
                    case "//":
                        estado = -102;
                        break;// //
                    case "/=":
                        estado = -103;
                        break;// /=
                    case "Constentero":
                        estado = -105;
                        break;// dec
                    case "Constreal":
                        estado = -106;
                        break;// deci
                    case "Constexponencial":
                        estado = -107;
                        break;// expo
                    case "Constcaracter":
                        estado = -108;
                        break;// caracter
                    case "Constcadena":
                        estado = -109;
                        break;// texto
                    case "+":
                        estado = -110;
                        break;// +
                    case "++":
                        estado = -111;
                        break;// ++
                    case "+=":
                        estado = -112;
                        break;// +=
                    case "*":
                        estado = -113;
                        break;// *
                    case "**":
                        estado = -114;
                        break;// **
                    case "*=":
                        estado = -115;
                        break;// *=
                    case "-":
                        estado = -116;
                        break;// -
                    case "--":
                        estado = -117;
                        break;// --
                    case "-=":
                        estado = -118;
                        break;// -=
                    case "%":
                        estado = -119;
                        break;// %
                    case "^":
                        estado = -120;
                        break;// ^
                    case "!":
                        estado = -121;
                        break;// !
                    case "!=":
                        estado = -122;
                        break;// !=
                    case "&":
                        estado = -123;
                        break;// &
                    case "&&":
                        estado = -124;
                        break;// &&
                    case "|":
                        estado = -125;
                        break;// |
                    case "||":
                        estado = -126;
                        break;// ||
                    case "#":
                        estado = -127;
                        break;// #
                    case "<":
                        estado = -128;
                        break;// <
                    case "<<":
                        estado = -129;
                        break;// <<
                    case "<=":
                        estado = -130;
                        break;// <=
                    case "<+":
                        estado = -131;
                        break;// <+
                    case ">":
                        estado = -132;
                        break;// >
                    case ">>":
                        estado = -133;
                        break;// >>
                    case ">=":
                        estado = -134;
                        break;// >=
                    case ">+":
                        estado = -135;
                        break;// >+
                    case "=":
                        estado = -136;
                        break;// =
                    case "==":
                        estado = -137;
                        break;// ==
                    case "=<":
                        estado = -138;
                        break;// =<
                    case "=>":
                        estado = -139;
                        break;// =>
                    case ";":
                        estado = -140;
                        break;// ;
                    case ",":
                        estado = -141;
                        break;// ,
                    case ".":
                        estado = -142;
                        break;// .
                    case "(":
                        estado = -143;
                        break;// (
                    case ")":
                        estado = -144;
                        break;// )
                    case "[":
                        estado = -145;
                        break;// [
                    case "]":
                        estado = -146;
                        break;// ]
                    case "{":
                        estado = -147;
                        break;// {
                    case "}":
                        estado = -148;
                        break;// }
                    case ":":
                        estado = -149;
                        break;// :
                    case "$":
                        estado = -150;
                        break;// $
                    case "~":
                        estado = -151;
                        break;// ~
                    default:
                        break;
                }
                if (i == 2) {
                    produccion[i] = "" + estado + " ";
                } else if (i == lexema.length) {
                    produccion[i] = "" + estado + ", ";
                } else {
                    produccion[i] = estado + ", ";
                }
            }
            System.out.print("{ ");
            for (int i = produccion.length - 1; i > 1; i--) {
                System.out.print(produccion[i]);
            }
            System.out.print("},");
            System.out.println("");
        }
    }
}
