publi class User{
  string name;
  String password;
  String Login(){
    return "Logged In"
}
  String Register(){
    if (name.equals("")|| password.equals(""){
      return "Can't be empty"
  }else{
      return "Sucess";
  }

  Class Admin extends user{
    String StaffNo;

    string upload Result(String Course,float score){
       system.out.println(Course + " " + score);
   }
  }
