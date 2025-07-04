package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }

          // Test Case 2: รหัสผ่านเป็น empty ควรจะ INVALID
        PasswordStrength result2 = PasswordValidator.validate("");
        if (result2 == PasswordStrength.INVALID) {
            System.out.println("Test Case 2 Passed: empty password is INVALID.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + result2);
        }
         // Test Case 3: รหัสผ่านที่มีทั้งตัวเลขและตัวอักษร ควรจะ Weak
        PasswordStrength result3 = PasswordValidator.validate("12345678comsic");
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 Passed: have text  Password is Weak");
        } else {
            System.out.println("Test Case 3 FAILED: Expected Weak but got " + result3);
        }

         // Test Case 4: รหัสผ่านที่มีทั้งตัวเลขตัวอักษรตัวอักษรเล็กและใหญ่ ควรจะ Medium
        PasswordStrength result4 = PasswordValidator.validate("12345678ComSic");
        if (result4 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4 Passed: have bigText and smallText Password is  Medium");
        } else {
            System.out.println("Test Case 4 FAILED: Expected Medium but got " + result4);
        }
        // Test Case 5: รหัสผ่านที่มีทั้งตัวเลขตัวอักษรตัวอักษรเล็กใหญ่และมีอักษรพิเศษ ควรจะ Strong
        PasswordStrength result5 = PasswordValidator.validate("12345678@ComSic");
        if (result5 == PasswordStrength.STRONG) {
            System.out.println("Test Case 5 Passed: have bigText and smallText and have special character Password is Strong");
        } else {
            System.out.println("Test Case 5 FAILED: Expected Strong but got " + result5);
        }

        
        // Test Case 6: รหัสผ่านที่มีอักษรพิเศษอย่างเดียว ควรจะเป็น 
        PasswordStrength result6 = PasswordValidator.validate("@@@@@@@@");
        if (result6 == PasswordStrength.INVALID) {
            System.out.println("Test Case 6 Passed: have special character only Password is INVALID");
        } else {
            System.out.println("Test Case 6 FAILED: Expected INVALID but got " + result6);
        }
        // Test Case 7: รหัสผ่านที่มีอักษรพิเศษอย่างเดียว ควรจะเป็น 
        PasswordStrength result7 = PasswordValidator.validate("11111111");
        if (result7 == PasswordStrength.INVALID) {
            System.out.println("Test Case 7 Passed: have number only Password is INVALID");
        } else {
            System.out.println("Test Case 7 FAILED: Expected INVALID but got " + result7);
        }
         // Test Case 8: รหัสผ่านที่มีตัวอักษรพิมพ์ใหญ่อย่างเดียว ควรจะเป็น 
         PasswordStrength result8 = PasswordValidator.validate("CCCCCCCCCC");
         if (result8 == PasswordStrength.INVALID) {
             System.out.println("Test Case 8 Passed: have big Text only Password is INVALID");
         } else {
             System.out.println("Test Case 8 FAILED: Expected INVALID but got " + result8);
         }
        
       

        System.out.println("--------------------------------");
    }
}
