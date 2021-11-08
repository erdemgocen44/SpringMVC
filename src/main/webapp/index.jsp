<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Spring MVC</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <h1 class="text-center">SpringMVC Örnekleri</h1>
    <div class="container">
      <form action="submit">
        <!-- submite basılınca sayılar işleme tabi tutulmak üzere control sayfasına gönderilir-->
        <div class="mb-3">
          <label for="sayi1">1.SAYI</label>
          <input
            type="number"
            class="form-control"
            id="sayi1"
            placeholder="1.Sayıyı Giriniz"
            name="sayi1"
          />
        </div>
        <div class="mb-3">
          <label for="sayi2">2.SAYI</label>
          <input
            type="number"
            class="form-control"
            id="sayi2"
            placeholder="2.Sayıyı Giriniz"
            name="sayi2"
          />
        </div>
        <button type="submit" class="btn btn-primary">Gönder</button>
      </form>
    </div>
  </body>
</html>
