
public class CNF {


    private String data;

    public CNF () {
        data=null;
    }


    public CNF (String input){
        if (input == null)
            throw new IllegalArgumentException("CNF string isn't be null");
        data=input;
    }

    public String getData(){
        return data;
    }


    public boolean cnfFormat(){
        boolean result=true;

        clearString();
        if (data.contains(".") == false || data.charAt(0) != '(' || data.charAt(data.length() - 1) != ')') {
            result = false;
        }
        else {
            // oldIndex was used to follow next clauses.
            int oldIndex = 0;
            // result==true should be a condition. When a clause is invalid. input CNF should be invalid.
            for (int i = oldIndex; i < data.length() && result == true; ++i) {
                if (data.charAt(i) == '.') {
                    if (!checkingClause(data.substring(oldIndex, i)))
                        result = false;
                    oldIndex = i + 1;
                }
            }
            if (!checkingClause(data.substring(oldIndex, data.length())))
                result = false;
        }
        return result;
    }

    protected boolean checkingClause(String var){
        boolean result=true;
        // Length is a zero then return false directly.
        if(var.length()==0)
            return false;

        return result;
    }


    protected void clearString(){

    }

    public static void main(String args[]){
    
    }
}