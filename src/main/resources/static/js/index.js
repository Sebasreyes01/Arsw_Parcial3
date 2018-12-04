var Conversor = (function () {
    
    const instance = axios.create({
        //baseURL: 'http://localhost:8080'
        baseURL: 'https://arsw-parcial3.herokuapp.com'
    });

    
    var fc = function () {
        var input = document.getElementById("valorF");
        var p = document.getElementById("c");        
        instance.get('/conversor/fahrenheit/' + input.value)
                .then(function (response) {
                    p.innerHTML = response.data;
                    console.log(response);
                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                })
    };
    
    var cf = function () {
        var input = document.getElementById("valorC");
        var p = document.getElementById("f");        
        instance.get('/conversor/celsius/' + input.value)
                .then(function (response) {
                    p.innerHTML = response.data;
                    console.log(response);
                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                })
    };
    
    return {
        fc:fc,
        cf:cf
    };
    
})();