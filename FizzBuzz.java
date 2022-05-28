class Main {

  public static void main(String args[]) {
    for (int i = 1; i <= 100; i++) {
      String str = "";

      // ここから記述
      // はじめにターゲットの整数が15で割れるかどうかをたしかめ、
      // その後で3もしくは5で割れるかを検証する。
      // 15で割れる整数である場合には、"FizzBuzz"と出力したいので、
      // 出力する文字列strが"FizzBuzz"を参照するようにする。
      if (i % 15 == 0) {
        str = "FizzBuzz";
      } else if (i % 3 == 0) {
      // 3で割れる整数である場合には、"Fizz"と出力したいので、
      // 出力する文字列strが"Fizz"を参照するようにする。
        str = "Fizz";
      } else if (i % 5 == 0) {
      // 3で割れる整数である場合には、"Buzz"と出力したいので、
      // 出力する文字列strが"Buzz"を参照するようにする。
        str = "Buzz";
      } else {
      // それ以外場合は、整数iをそのまま出力したいので、
      // iをint型から文字列に変換し、  
      // 出力する文字列strがそれを参照するようにする。
        str = String.valueOf(i);
      }
      // ここまで記述

      System.out.println(str);
    }
  }
}
