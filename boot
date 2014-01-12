'rm ~/.zshrc
echo "source ~/al.sh" > ~/.zshrc


cat <<< EOL

alias "z"="kate ~/al.sh"
alias "ط"="kate ~/al.sh"
alias "س"="zsh"
alias "سم"="alias"
alias "قل"="echo"
alias "اكتب"="vim"
alias "اقرا"="cat"
alias "اكتب عربي"="vim -A"
alias "اعد"="zsh"
alias "نظف"="clear"
alias "التاريخ"="clear"
alias "التحديث"="agg"

EOL

