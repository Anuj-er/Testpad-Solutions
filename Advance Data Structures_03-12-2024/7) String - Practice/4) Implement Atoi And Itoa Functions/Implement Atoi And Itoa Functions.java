class Result {
  static String itoa(int num) {
      StringBuilder str = new StringBuilder();
      boolean negative = false;
      if(num < 0) {
          negative = true;
          num = -num;
      }
      do {
          char digit = (char) ((num % 10) + '0');
          str.insert(0,digit);
          num /= 10;
      } while(num > 0);
      if(negative) {
          str.insert(0,'-');
      }
      return str.toString();
  }
  static int atoi(String str) {
      int num = 0;
      int sign = 1;
      int i = 0;
      if(str.charAt(0) == '-') {
          sign = -1;
          i++;
      }
      for(; i < str.length(); i++) {
          num = num * 10 + (str.charAt(i) - '0');
      }
      return num * sign;
  }
}