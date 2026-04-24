<html>
<body>
    <h2>Hello World!</h2>
    <p>Counter value is: <span id="counter-value">0</span></p>
    
    <button type="button" onclick="incrementCounter()">Increase Counter</button>

    <script>
      let counter = 0;
      function incrementCounter() {
        counter += 1;
        document.getElementById("counter-value").textContent = counter;

        // Note: use the context path /my-app/ if that's what you set in Jenkins
        fetch('/my-app/increment'); 
      }
    </script>
</body>
</html>