package com.example.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    // 싱글톤은 getInstance로만 호출 가능 (객체가 여러개 생성되는 것을 방지)
    public static SingletonService getInstance() {
        return instance;
    }

    //private으로 생성자를 선언해서 new 키워드를 사용한 객체 생성을 방지한다.
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

    public static void main(String[] args) {
        SingletonService singletonService1 = new SingletonService();
        SingletonService singletonService2 = new SingletonService();

    }

}
