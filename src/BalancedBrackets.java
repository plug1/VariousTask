public class BalancedBrackets {

    //my solution to balancedBrackets problem

    static String[] braces(String[] values) {

        int asci_40=0;
        int asci_41=0;
        int asci_91=0;
        int asci_93=0;
        int asci_123=0;
        int asci_125=0;

        int temp;

        int temp_2=0;

        int  how_many_operations = Integer.parseInt(values[0]);

        String[] result= new String[how_many_operations];

        for(int i=0; i< how_many_operations ; i++){

            String data = values[i+1];

            for(int j=0; j<data.length(); j++){

                if ( data.charAt(j)=='(')
                    asci_40++;
                else if ( data.charAt(j)==')')
                    asci_41++;
                else if ( data.charAt(j)=='[')
                    asci_91++;
                else if ( data.charAt(j)==']')
                    asci_93++;
                else if ( data.charAt(j)=='{')
                    asci_123++;
                else if ( data.charAt(j)=='}')
                    asci_125++;

            }

            if (asci_40!=asci_41)
                temp_2++;
            if (asci_91!=asci_93)
                temp_2++;
            if (asci_123!=asci_125)
                temp_2++;

            if(temp_2 > 0)
                result[i]="NO";
            else
                result[i]="YES";

            asci_40=0;
            asci_41=0;
            asci_91=0;
            asci_93=0;
            asci_123=0;
            asci_125=0;

        }
        return result;
    }

    public static void main(String[] args) {

        String[] data = new String[]{"2","{}[]()","{[}]"};
        //String[] data = new String[]{"3","()[]{((((((}","())","6756756"};
        braces(data);

    }

}
