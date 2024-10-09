const canvas = document.getElementById("gameCanvas");
    const ctx = canvas.getContext("2d");
    const snakeSize = 20;
    const gridSize = 20;
    const gameSpeed = 10;

    let snakeX = 50;
    let snakeY = 50;
    let snakeDirection = "right";
    let snakeBody = [];
    let foodX;
    let foodY;
    let score = 0;

    function initGame() {
      snakeBody.push({ x: snakeX, y: snakeY });
      generateFood();
    }

    function generateFood() {
      foodX = Math.floor(Math.random() * (canvas.width / gridSize)) * gridSize;
      foodY = Math.floor(Math.random() * (canvas.height / gridSize)) * gridSize;
    }

    function drawGame() {
      ctx.clearRect(0, 0, canvas.width, canvas.height);
      ctx.fillStyle = "green";
      for (let i = 0; i < snakeBody.length; i++) {
        ctx.fillRect(snakeBody[i].x, snakeBody[i].y, snakeSize, snakeSize);
      }
      ctx.fillStyle = "red";
      ctx.fillRect(foodX, foodY, snakeSize, snakeSize);
      ctx.font = "24px Arial";
      ctx.fillStyle = "black";
      ctx.textAlign = "left";
      ctx.textBaseline = "top";
      ctx.fillText(`Score: ${score}`, 10, 10);
    }

    function updateGame() {
      switch (snakeDirection) {
        case "right":
          snakeX += gridSize;
          break;
        case "left":
          snakeX -= gridSize;
          break;
        case "up":
          snakeY -= gridSize;
          break;
        case "down":
          snakeY += gridSize;
          break;
      }

      if (snakeX < 0 || snakeX >= canvas.width || snakeY < 0 || snakeY >= canvas.height) {
        alert("Game Over!");
        return;
      }

      if (snakeBody.length > 0) {
        for (let i = 0; i < snakeBody.length; i++) {
          if (snakeBody[i].x === snakeX && snakeBody[i].y === snakeY) {
            alert("Game Over!");
            return;
          }
        }
      }

      snakeBody.push({ x: snakeX, y: snakeY });

      if (snakeX === foodX && snakeY === foodY) {
        score++;
        generateFood();
      } else {
        snakeBody.shift();
      }
    }

    function handleKeydown(event) {
      switch (event.key) {
        case "ArrowRight":
          if (snakeDirection!== "left") {
            snakeDirection = "right";
          }
          break;
        case "ArrowLeft":
          if (snakeDirection!== "right") {
            snakeDirection = "left";
          }
          break;
        case "ArrowUp":
          if (snakeDirection!== "down") {
            snakeDirection = "up";
          }
          break;
        case "ArrowDown":
          if (snakeDirection!== "up") {
            snakeDirection = "down";
          }
          break;
      }
    }

    document.addEventListener("keydown", handleKeydown);

    initGame();
    setInterval(() => {
      updateGame();
      drawGame();
    }, 1000 / gameSpeed);
  