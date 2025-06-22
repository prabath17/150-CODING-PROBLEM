

class problem_103{
    public static void main(String[] args) {
        String s="In India Malayalam is best with dad and mom";
        String[] str=s.split(" ");
        //System.out.println(Arrays.toString(str));
        for(String i:str) {
        String rev = new StringBuilder(i).reverse().toString();
            if(!i.equalsIgnoreCase(rev)){
                //System.out.println(i);
                
            
                System.out.println(i);
            }   
        }
    }
}