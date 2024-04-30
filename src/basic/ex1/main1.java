package basic.ex1;

import java.util.ArrayList;
import java.util.List;

public class main1 {
    public static void main(String[] args) {

        List<MovieReview> reviews = new ArrayList<>();

        MovieReview movieReview1 = new MovieReview("인셉션", "인생은 무한루프");
        MovieReview movieReview2 = new MovieReview("어바웃 타임", "인생 시간 영화");

        reviews.add(movieReview1);
        reviews.add(movieReview2);

        for (MovieReview review : reviews){
            System.out.println("영화제목 : " + review.title + ", 리뷰 : " + review.review);
        }
    }
}
