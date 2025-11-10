public  class string2 { 
    public static void main(String[] args){
       
      //  StringBuilder str = new StringBuilder("JATAV RIYA");
        //Append
       // str.append(" world");
       // System.out.println("append():"+str);
        //Replace
        // str.replace(1,4,"Java");
       // System.out.println("replace():"+str);
       //Delete
       // str.delete(1,2);
       // System.out.println("delete():"+str);
       //DeleteCharAt
       // str.deleteCharAt();
         //DeleteCharAt
         //str.deleteCharAt(3);
         //   System.out.println("deleteCharAt():"+str);
         //Reverse
        // str.reverse();
            //System.out.println("reverse():"+str);
            //Reverse string
            String str="java loevely";
            String a[]=str.split(" ");
            StringBuilder result=new StringBuilder();
            for(String ele :a){
                StringBuilder val=new StringBuilder(ele);
                result.append(val.reverse().append(" "));
            }
                System.out.println("reverse string:"+result);

            }       
    }

