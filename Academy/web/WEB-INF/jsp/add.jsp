<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <title>Add</title>
    </head>
    <body>
       <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>New Register</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Id:</label>
                        <input type="number" name="id" class="form-control"/>
                        <label>Name:</label>
                        <input type="text" name="firstname" class="form-control"/>
                        <label>Lastname:</label>
                        <input type="text" name="lastname" class="form-control"/>
                        <input type="submit" value="add" class="btn btn-primary"/>
                        <a href="index.htm">Back</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
