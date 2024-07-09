<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="./assets/style/index.css">
</head>
<body>
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-header text-center">
                    <h2>Calculadora</h2>
                </div>
                <div class="card-body">
                    <form action="calculadora" method="post">
                        <div class="mb-3">
                            <label for="numero1" class="form-label">Primer Número</label>
                            <input type="number" class="form-control" id="numero1" name="numero1" required>
                            <div class="invalid-feedback">Por favor ingrese un numero.</div>
                        </div>
                        <div class="mb-3">
                            <label for="numero2" class="form-label">Segundo Número</label>
                            <input type="number" class="form-control" id="numero2" name="numero2" required>
                            <div class="invalid-feedback">Por favor ingrese un numero.</div>
                        </div>
                        <div class="mb-3">
                            <label for="operation" class="form-label">Operación</label>
                            <select id="operation" class="form-select" name="operation" required>
                                <option value="suma">Suma</option>
                                <option value="resta">Resta</option>
                                <option value="multiplicacion">Multiplicación</option>
                                <option value="division">División</option>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary w-100">Calcular</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="./assets/js/index.js"></script>
</body>
</html>