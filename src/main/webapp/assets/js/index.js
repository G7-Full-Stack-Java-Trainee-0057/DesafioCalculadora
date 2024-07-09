document.addEventListener("DOMContentLoaded", function() {
    var form = document.querySelector("form");

    form.addEventListener("submit", function(event) {
        var numero1 = document.getElementById('numero1');
        var numero2 = document.getElementById('numero2');

        var valido = true;

        if (!isInteger(numero1.value.trim())) {
            numero1.classList.add('is-invalid');
            numero1.nextElementSibling.style.display = 'block';
            valido = false;
        } else {
            numero1.classList.remove('is-invalid');
            numero1.nextElementSibling.style.display = 'none';
        }

        if (!isInteger(numero2.value.trim())) {
            numero2.classList.add('is-invalid');
            numero2.nextElementSibling.style.display = 'block';
            valido = false;
        } else {
            numero2.classList.remove('is-invalid');
            numero2.nextElementSibling.style.display = 'none';
        }

        if (!valido) {
            event.preventDefault();
        }
    });

    function isInteger(value) {
        var num = Number(value);
        return Number.isInteger(num) && !isNaN(num);
    }
});
