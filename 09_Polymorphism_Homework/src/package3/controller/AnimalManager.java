package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {
   public static void main(String[] args) {
      Animal[] arr = new Animal[5];
      arr[0] = new Cat("코코","브리티쉬숏헤어","영국","회색");
      arr[1] = new Dog("말랑","골든리트리버",30);
      arr[2] = new Dog("할배","말티즈",4);
      arr[3] = new Cat("쿠쿠","브리티쉬헤어","영국","노랑");
      arr[4] = new Cat("말랑","브리티쉬숏헤어","영국","회색");
      
      for(int i =0; i<arr.length;i++) {
         arr[i].speak();
      }
   }
}