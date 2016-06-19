package com.zuperztar;

import javax.persistence.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            //logic(em);
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback(); //트랜잭션 롤백
        } finally {
            em.close(); //엔티티 매니저 종료
        }

        emf.close(); //엔티티 매니저 팩토리 종료
    }

    public static void logic(EntityManager em) {

        //String id = "id1";

//        for(int i=1; i<=100000; i++) {
//            Member member = new Member();
//            //member.setId(id);
//            member.setUsername("지한" + i);
//            member.setAge(12);
//
//            //등록
//            em.persist(member);
//
//        }

//        for(long i=10; i<100; i++) {
//            Member findMember = em.find(Member.class, i);
//            System.out.println("findMember=" + findMember.getUsername() + ", age=" + findMember.getAge());
//        }

//        Member findMember = em.find(Member.class, id);
//        System.out.println("findMember=" + findMember.getUsername() + ", age=" + findMember.getAge());




        //수정
        //member.setAge(20);

        //한 건 조회
//        Member findMember = em.find(Member.class, id);
//        System.out.println("findMember=" + findMember.getUsername() + ", age=" + findMember.getAge());

        //목록 조회
//        List<Member> members = em.createQuery("select m from member m", Member.class).getResultList();
//        System.out.println("members.size=" + members.size());

        //삭제
        //em.remove(member);

    }
}
