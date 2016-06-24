
package ProjectEbro;


public class Ticket {
    
    
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String option5;
    private String option6;
    private String option7;
    private String option8;
    private String option9;  
    
    ///////////////////////
    //                   //
    // -> To ViewHandler //
    //                   //
    ///////////////////////



    private String output;
    private String title;   
    
    private String lblBtn1;
    private String lblBtn2;
    private String lblBtn3;
    private String lblBtn4;
    private String lblBtn5;
    private String lblBtn6;
    private String lblBtn7;
    private String lblBtn8;
    private String lblBtn9;

    
    
    ///////////////////////
    //                   //
    // <- To Controller  //
    //                   //
    ///////////////////////

    
    
    
    
    /////////////////////////
    
    public Ticket() {
        
    }

    
    
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    public void setOptions(String o1, String lbl1, String o2, String lbl2, String o3, String lbl3, String o4, String lbl4, String o5,String lbl5, String o6,String lbl6, String o7, String lbl7, String o8, String lbl8, String o9, String lbl9){
    
        option1 = o1;
        option2 = o2;
        option3 = o3;
        option4 = o4;
        option5 = o5;
        option6 = o6;
        option7 = o7;
        option8 = o8;
        option9 = o9;
    

        if (!"".equals(option1)){
            lblBtn1 = lbl1;}

        if (!"".equals(option2)){
            lblBtn2 = lbl2;}

        if (!"".equals(option3)){
            lblBtn3 = lbl3;}

        if (!"".equals(option4)){
            lblBtn4 = lbl4;}

        if (!"".equals(option5)){
            lblBtn5 = lbl5;}

        if (!"".equals(option6)){
            lblBtn6 = lbl6;}

        if (!"".equals(option7)){
            lblBtn7 = lbl7;}

        if (!"".equals(option8)){
            lblBtn8 = lbl8;}

        if (!"".equals(option9)){
            lblBtn9 = lbl9;}        
    }
    
 
    
    
    
    
}
