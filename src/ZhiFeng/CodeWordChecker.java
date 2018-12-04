package ZhiFeng;

public class CodeWordChecker implements StringChecker{
    private int min;
    private int max;
    private String symbol;

    public CodeWordChecker(int min, int max, String symbol){
        this.min = min;
        this.max=max;
        this.symbol=symbol;
    }

    public CodeWordChecker(String symbol){
        this.min = 6;
        this.max= 20;
        this.symbol = symbol;
    }

    public boolean isValid(String str)
    {
        if((str.length() < min) || (str.length() > max) || (str.contains(symbol)))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
