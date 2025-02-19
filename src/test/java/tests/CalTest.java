package tests;

import com.companyName.base.BaseTest;
import com.companyName.core.Calculator;


import com.companyName.utils.ExcelUtils;
import com.companyName.utils.JsonUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;


public class CalTest extends BaseTest {
    Calculator calculator = new Calculator();

    @Test
    public void cal() throws IOException, URISyntaxException {
        int result =  calculator.sum(5,3);
        Assertions.assertEquals(8, result , "Failed");

        List<List<String>> excelData=    ExcelUtils.readExcelFile("User-Data.xlsx");

        Assertions.assertNotNull(excelData,"File does not found or Data");

        String userInfo = JsonUtils.readJsonFile("user.json");






    }



    @Test
    public void sub(){
        Assertions.assertEquals(1,calculator.sub(9,8),"Answer is Wrong");
    }


    @Test
    public void upperCase(){
        String expectedWord = "HELLO WORLD";

        Assertions.assertEquals(expectedWord, calculator.upperCase("hello world"),"it not same");
    }

}
