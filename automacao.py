import pyautogui
import pyperclip
import time

# Passo 1: Entrar no sistema da empresa. (nesse caso, o link do drive) usando pyautogui.
# pyautogui.hotkey -> conjunto de teclas
# pyautogui.write -> escrever um texto
# pyautogui.press -> apertar 1 tecla
pyautogui.PAUSE = 0.5


# Abrir google
pyautogui.press("win")
pyautogui.write("Chrome")
pyautogui.press("enter")
time.sleep(3)
pyautogui.click(x=510, y=424)
time.sleep(2)
pyautogui.hotkey("ctrl","t")


# entrar no sistema
pyperclip.copy("https://drive.google.com/drive/folders/149xknr9JvrlEnhNWO49zPcw0PW5icxga?usp=sharing")
pyautogui.hotkey("ctrl","v")
pyautogui.press("enter")

time.sleep(4)

# Navegar pelo sistema e encontrar a base de dados
pyautogui.click(x=372, y=305, clicks=2)
time.sleep(3)


# fazer donwload
pyautogui.click(x=354, y=300)  # clica arquivo
pyautogui.click(x=1163, y=196)  # tres pontos
pyautogui.click(x=940, y=620)  # download
time.sleep(5)


# ler o arquivo e pegar os dados
import pandas as pd
tabela = pd.read_excel(r"C:\Users\pedra\Downloads\Vendas - Dez.xlsx")  # ler a base de dados e armazenar em variável tabela
faturamento = tabela["Valor Final"].sum()
quantidade = tabela["Quantidade"].sum()

# Passo 6: Enviar um email para a diretoria com o relatório.
# Abrir o email (https://mail.google.com/mail/u/0/#inbox)

pyautogui.hotkey("ctrl","t")
pyperclip.copy("https://mail.google.com/mail/u/0/#inbox")
pyautogui.hotkey("ctrl","v")
pyautogui.press("enter")
time.sleep(3)
# clicar escrever
pyautogui.click(x=44, y=205)
time.sleep(2)
pyautogui.write("pedranx@outlook.com")
pyautogui.press("tab")
pyautogui.press("tab")
pyperclip.copy("Relatório de vendas")
pyautogui.hotkey("ctrl","v")
pyautogui.press("tab")

texto = f""" 
Prezados, bom dia!

O faturamento de ontem foi de: R${faturamento:,.2f}
A quantidade de produtos vendidos foi: {quantidade:,}

As ordens
Pedro"""

pyperclip.copy(texto)
pyautogui.hotkey("ctrl","v")

#enviar
pyautogui.hotkey("ctrl","enter")
