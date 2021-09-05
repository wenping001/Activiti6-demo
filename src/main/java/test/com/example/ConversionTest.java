package test.com.example; 

import com.example.Conversion;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* Conversion Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 5, 2021</pre> 
* @version 1.0 
*/ 
public class ConversionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: tempConversion(double temperature, String unit) 
* 
*/ 
@Test
public void testTempConversion() throws Exception {

    Conversion test = new Conversion();

    double temp = 80.0d;
    String unit = "";
    double result = test.tempConversion(temp,unit);

    assertEquals(176.0d,result,0.0);
}


} 
