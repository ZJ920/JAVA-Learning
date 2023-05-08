package test;

import domain.Movie;

import java.util.Scanner;

public class MovieService {
    private Scanner sc = new Scanner(System.in);
    private Movie[] movies;//movies[]中存的是movie1,movie2,movie3的地址

    public MovieService(Movie[] movies) {
        this.movies = movies;

        for (int i=0;i<movies.length;i++){
            System.out.println("打印MovieService中的this.movies["+i+"]："+this.movies[i]);
        }

    }

    public void start() {
        int choice1;

        do{
            System.out.println("------电影信息系统------");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询电影信息");
            System.out.println("3.退出");
            System.out.print("请输入您的选择：");
            int choice = sc.nextInt();
            choice1 = choice;
            switch (choice){
                case 1:
                    allMovies();
                    break;
                case 2:
                    idMovies();
                    break;
                case 3:
                    System.out.println("退出");
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }while (choice1!=3);
    }
//打印全部电影 电影名+评分
    private void allMovies() {
        for (int i=0;i<movies.length;i++){
            System.out.println(movies[i].getTitle() + "---" + movies[i].getScore());
        }
    }
    //打印一部电影全部信息
    private void idMovies() {
        System.out.print("请输入电影ID:");
        int choice = sc.nextInt();
        for(int i=0;i< movies.length;i++){
            if (choice == movies[i].getId()){
                System.out.println(movies[i].getTitle()+"-"+movies[i].getTime()+"-"+
                                   movies[i].getScore()+"-"+movies[i].getArea()+"-"+
                                   movies[i].getType()+"-"+movies[i].getDirector()+"-"+
                                   movies[i].getStarring());
                return;
            }
        }
        System.out.println("输入电影ID有误，请重新输入");
    }

}
