<!DOCTYPE html>
<html lang="en"><head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<h1><center>Register Below...</center></h1>
<body>
<div class="container">
<form method="post" action="adduser">
  <div class="form-group">
    <label for="formGroupExampleInput">First Name</label>
    <input type="text" name="fname" class="form-control" id="formGroupExampleInput" placeholder="Enter First Name">
  </div>
   <div class="form-group">
      <label for="formGroupExampleInput">Last Name</label>
      <input type="text" name="lname"  class="form-control" id="formGroupExampleInput" placeholder="Enter Last Name">
    </div>
  <div class="form-group">
    <label for="formGroupExampleInput2">City</label>
    <input type="text" name="city"  class="form-control" id="formGroupExampleInput2" placeholder="Enter City">
  </div>
   <div class="form-group">
        <label for="formGroupExampleInput">Age</label>
        <input type="text"  name="age"  class="form-control" id="formGExampleInput" placeholder="Enter Age">
      </div>
    <input type="submit" value="Register">
</form>
</div>
</body>
</html>