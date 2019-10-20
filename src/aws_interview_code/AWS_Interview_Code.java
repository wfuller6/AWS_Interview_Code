/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aws_interview_code;

/**
 *
 * @author Scott
 */
public class AWS_Interview_Code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        syso("begin");
        args = "abcdefg::aabcdef::aa bb cc ddd::all     good people::fred barney wilma bettyy::larry::aaaaa::".split("::");
        for (int i=0;i<args.length;i++){
            switch(i){
                case 0:
                   // syso(getLongestSubstringOfLikeChars(args[i]),"");
                    break;
                case 1:
                    syso(getLongestSubstringOfLikeChars(args[i]),"a");
                    break;
                case 2:
                    syso(getLongestSubstringOfLikeChars(args[i]),"dd");
                    break;
                case 3:
                    syso(getLongestSubstringOfLikeChars(args[i]),"l");
                    break;
                case 4:
                    syso(getLongestSubstringOfLikeChars(args[i]),"t");
                    break;
                case 5:
                    syso(getLongestSubstringOfLikeChars(args[i]),"r");
                    break;
                case 6:
                    syso(getLongestSubstringOfLikeChars(args[i]),"aaaa");
                    break;
                case 7:
                    syso(getLongestSubstringOfLikeChars(args[i]),"aaaa");
                    break;
                default:
                    break;                    
                
            }
            
        }
        syso(getLongestSubstringOfLikeChars(null),"");
        
        syso("end");
    }
    public static String getLongestSubstringOfLikeChars(String instr){
        String rval="";
        if (instr == null || instr=="" || instr.length()==1){
            return "";
        }
        for (int i=0;i<instr.length()-1;i++){
            for (int j=i+1;j<instr.length();j++){
                if (instr.charAt(j)!=instr.charAt(i) || instr.charAt(j) == 32){
                    break;
                }
                if (j-i>=1 && j-i > rval.length()){
                    rval=instr.substring(i, j);
                }
            }
        }
        return rval;
    }
    public static void syso(String s){
        System.out.println(s);
    }
    public static void syso(String s, String checkString){
        if (s.equals(checkString)){
            syso(s + " valid");
        }else{
            syso(s + " not valid");
        }
        
    }

}
