const path = require('path');
// ans = path.normalize('/abc/../asd/../shreya');
// console.log(ans);
// ans1 = path.join('/abc/xyz','/zxc/dgfhf');
// console.log(ans1);
// ans2 = path.resolve('pathdemo.js');
// console.log(ans2);
// ans3 = path.relative('/abc/xyz','/abc/zxc/dgfhf')
// console.log(ans3);
// ans4 = path.dirname('C:\\Users\\shrey\\OneDrive\\Desktop\\WT\\lab-17\\pathdemo.js\\');
// console.log(ans4);
// ans5 = path.basename('C:\\Users\\shrey\\OneDrive\\Desktop\\WT\\lab-17\\pathdemo.js\\');
// console.log(ans5);
// ans6 = path.extname('C:\\Users\\shrey\\OneDrive\\Desktop\\WT\\lab-17\\pathdemo.js\\');
// console.log(ans6);
// ans7 = path

// console.log(process.env.PATH);
// // Prints: 'C:\Windows\system32;C:\Windows;C:\Program Files\node\'

// process.env.PATH.split(path.delimiter);
// // Returns ['C:\\Windows\\system32', 'C:\\Windows', 'C:\\Program Files\\node\\']

// ans9 = path.format({
//     dir: 'C:\\path\\dir',
//     base: 'file.txt',
//   });
// console.log(ans9);

ans10 = path.isAbsolute('C:\\Windows');
ans11 = path.isAbsolute('shreya.js');
console.log(ans10,ans11);