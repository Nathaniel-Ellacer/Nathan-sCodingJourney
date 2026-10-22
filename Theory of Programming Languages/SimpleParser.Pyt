def parse_tokens(user_input: str) -> str:
    tokens = user_input.strip().split()

    pattern_3_tokens = [
        "<data_type>",
        "<identifier>",
        "<delimiter>"
    ]
    
    pattern_5_tokens = [
        "<data_type>",
        "<identifier>",
        "<assignment_operator>",
        "<value>",
        "<delimiter>"
    ]
    
    if tokens == pattern_3_tokens or tokens == pattern_5_tokens:
        return "Syntax is Correct!"
    
    return "Syntax is Error!"


def main():
    user_input = input("Enter Tokens: ")
    result = parse_tokens(user_input)
    print(result)


if __name__ == "__main__":
    main()