const childProcess = require('child_process');
childProcess.exec('dir',(error, stdout, stderr) =>{
       console.log(stdout);
    });



childProcess.execFile('node', ['--version'], (error, stdout, stderr) => {
  if (error) {
    throw error;
  }
  console.log(stdout);
});

