class Solution {
    public boolean isPalindrome(int x) {
        String novo = x.toString();
        String inverte = "";
        for (int i = 0; i < novo.lenght(); i--) {
            inverte += substring(i - 1, i);
        }
        return inverte.toParseInt();
    }
}
//terminar