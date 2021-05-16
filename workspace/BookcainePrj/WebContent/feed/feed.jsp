<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="../css/feed.css" type="text/css" rel="stylesheet">
    <link rel="stylesheet" href="../header/header.css">
</head>

<header id="header">
    <div class="float-content">
        <h1 class="logo">
            <div class="logo-1">책에 중독되는 순간</div> Bookcaine
        </h1>
        <section>
            <h1 class="d-none">헤더</h1>
            <section class="book-search-form">
                <h1 class="d-none">도서검색폼</h1>
                <form action="">
                    <legend class="d-none">도서 검색 필드</legend>
                    <input class="form-input" type="text" name="search" placeholder="제목,저자,출판사 검색">
                    <input class="button" type="submit" value="검색">
                </form>
            </section>

            <nav class="quick-menu">
                <h1 class="d-none">퀵메뉴</h1>
                <ul>
                    <li><a href="../index.jsp">홈</a></li>
                    <li><a href="">도전방</a></li>
                    <li><a href="../profile/profile.html">프로필</a></li>
                </ul>
            </nav>
        </section>
    </div>
</header>

<main id="wrapper">

    <div id="main">
        <article>
            <div class="profile">
                <img class="profile-image" src="../images/user.PNG">
                <div class="profile-flex">
                    <a class="user-name">초록색레고</a>
                    <a class="date">2021-05-16</a>
                </div>
            </div>

            <div class="content">

                <div class="book-img">
                    <img class="img" src="../images/sample.jpg">
                </div>
                <a>[68p]</a>
                <div>
                    <a>여름은 오래 그 곳에 남아</a>
                </div>



                <div class="review-attr">
                    <span>좋아요 0</span>
                    <span>댓글 0</span>
                </div>
                <hr>
                <div class="review-btn-group">
                    <input id="like-button" type="button" value="좋아요">
                    <a href="#">댓글</a>
                </div>
            </div>
        </article>


    </div>

</main>


</body>

</html>