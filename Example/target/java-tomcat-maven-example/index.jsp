<html>
<body>
<h2>Hello World!</h2>
<p>Deployed build UI check: counter value is <span id="counter-value">0</span></p>
<button type="button" onclick="incrementCounter()">Increase Counter</button>

<script>
  let counter = 0;
  function incrementCounter() {
    counter += 1;
    document.getElementById("counter-value").textContent = counter;
  }
</script>
</body>
</html>
