package utils;

import io.cucumber.java.ParameterType;

public class transformer
{
    @ParameterType("is|is not")
    public boolean isOrNot(String value)
    {
        return value != null && value.contains("not");
    }

    @ParameterType("(?:\"([^\"]*)\")?")
    public String optionalMessage(String capturedString)
    {
        return capturedString;
    }
}
