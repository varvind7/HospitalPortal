
function ValidateEmail(email) 
{
 var reg= /^([A-Za-z0-9_\-\.]){1,}\@([A-Za-z0-9_\-\.]){1,}\.([A-Za-z]{2,4})$/;
 var address = email.value;
 
 if (reg.test(address)==false)
  {
    alert("Invalid email ");
    return false;
  }
}
