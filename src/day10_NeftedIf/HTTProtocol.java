package day10_NeftedIf;

public class HTTProtocol {
    public static void main(String[] args) {
        int StatusCode=201;
        String result=(StatusCode==200)?"OK":(StatusCode==201)?"Created":(StatusCode==202)?"Accepted":(StatusCode==301)?"Moved Permanently"
            :(StatusCode==303)?"See Other":(StatusCode==304)?"Not Modified":(StatusCode==307)?"Temporary Redirect":(StatusCode==400)?"Bad Request":(
        StatusCode==401)?"Unauthorized":(StatusCode==403)?"Forbidden":(StatusCode==404)?"Not Found":(StatusCode==410)?"Gone":(StatusCode==500)?"Internal Server Error":(
        StatusCode==503)?"Service Unavailable":"Unavailable code ";
        System.out.println(result);


    }
}
