package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object OVER_ONS
     
    /**
     * <p></p>
     */
    public static Object SOFTWARETESTING
     
    /**
     * <p></p>
     */
    public static Object SHT
     
    /**
     * <p></p>
     */
    public static Object UXLAB
     
    /**
     * <p></p>
     */
    public static Object MISSIE_VISIE
     
    /**
     * <p></p>
     */
    public static Object HETGILDE
     
    /**
     * <p></p>
     */
    public static Object SUPERTESTER
     
    /**
     * <p></p>
     */
    public static Object BLOG
     
    /**
     * <p></p>
     */
    public static Object VACATURES
     
    /**
     * <p></p>
     */
    public static Object CONTACT
     
    /**
     * <p></p>
     */
    public static Object ALGVOORW
     
    /**
     * <p></p>
     */
    public static Object PRIVACYBELEID
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            URL = selectedVariables['URL']
            OVER_ONS = selectedVariables['OVER_ONS']
            SOFTWARETESTING = selectedVariables['SOFTWARETESTING']
            SHT = selectedVariables['SHT']
            UXLAB = selectedVariables['UXLAB']
            MISSIE_VISIE = selectedVariables['MISSIE_VISIE']
            HETGILDE = selectedVariables['HETGILDE']
            SUPERTESTER = selectedVariables['SUPERTESTER']
            BLOG = selectedVariables['BLOG']
            VACATURES = selectedVariables['VACATURES']
            CONTACT = selectedVariables['CONTACT']
            ALGVOORW = selectedVariables['ALGVOORW']
            PRIVACYBELEID = selectedVariables['PRIVACYBELEID']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
