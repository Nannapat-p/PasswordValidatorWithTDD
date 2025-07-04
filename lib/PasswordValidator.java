package lib;

public class PasswordValidator {

    /**
        * มีฟังก์ชั่นชื่อ validate เอาไว้ตรวจสอบ password ว่ามีความปลอดภัยมากแค่ไหน
        * @param ค่าที่รับเข้ามาเป็น String
        * @return ส่งกลับไปเป็นค่าใน PasswordStrength ว่า password ที่เข้ามาตรวจสอบนั้น มีความปลอดภัยแค่ไหน
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
     
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...

        int count = 0;
        int minLength = 8 ;
        // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        if (password == null || password.length() <= minLength) {

            return PasswordStrength.INVALID;

        }else if (password.length() >= minLength) {

           for (char c : password.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    
                  
                     count ++;
                     break;
                    

                }else if ( ((int)c >= 33 && (int)c <47) || (int)c == 64  || ((int)c >= 91 && (int)c < 96)  ) {
                   count++;
                }else if (Character.isUpperCase(c)) {
                    
                    count++;
                  
                }

                 
           }

             
         if (count == 1) {

            return PasswordStrength.WEAK;

         }else if (count == 2) {

            return PasswordStrength.MEDIUM;
         }else if (count == 3) {
            return PasswordStrength.STRONG;
         }
             
                 

        }
          return PasswordStrength.INVALID;
      
    }
}