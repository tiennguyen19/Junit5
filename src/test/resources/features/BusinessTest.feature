Feature: Tinh tong chi phi cua khach hang

  Scenario Outline: khach hang la thanh vien chi mua san pham
    Given Khach hang la <MemberType>
    When Tinh tong <ServiceExpense> va <ProductExpense>
    Then Tong chi phi bang <TotalExpense>

    Examples:
      | Name       | Member | MemberType | Date       | ServiceExpense | ProductExpense | TotalExpense |
      | JohnNash   | TRUE   | PREMIUM    | 01/01/2022 |                | 400            | 360          |
      | Jessica01  | TRUE   | GOLD       | 05/01/2022 |                | 155            | 139.5        |
      | Hiddleston | TRUE   | SILVER     | 10/10/2020 |                | 199            | 179.1        |

  Scenario Outline: khach hang la thanh vien chi dung service
    Given Khach hang la <MemberType>
    When Tinh tong <ServiceExpense> va <ProductExpense>
    Then Tong chi phi bang <TotalExpense>

    Examples:
      | Name      | Member | MemberType | Date       | ServiceExpense | ProductExpense | TotalExpense |
      | Jessica02 | TRUE   | PREMIUM    | 05/01/2022 | 799            |                | 639.2        |
      | Jessica03 | TRUE   | GOLD       | 05/01/2022 | 799            |                | 679.15       |
      | Jessica04 | TRUE   | SILVER     | 05/01/2022 | 799            |                | 719.1        |


  Scenario Outline: khach hang la thanh vien dùng cả sản phẩm và service
    Given Khach hang la <MemberType>
    When Tinh tong <ServiceExpense> va <ProductExpense>
    Then Tong chi phi bang <TotalExpense>

    Examples:
      | Name       | Member | MemberType | Date       | ServiceExpense | ProductExpense | TotalExpense |
      | John       | TRUE   | GOLD       | 01/01/2022 | 500            | 400            | 785          |
      | Emily      | TRUE   | PREMIUM    | 05/10/2021 | 799            | 567.99         | 1150.399     |
      | Hiddleston | TRUE   | SILVER     | 10/10/2020 | 789            | 199            | 889.2        |

  Scenario Outline: khach hang khong phai thanh vien chi mua san pham
    Given Khach hang la <MemberType>
    When Tinh tong <ServiceExpense> va <ProductExpense>
    Then Tong chi phi bang <TotalExpense>

    Examples:
      | Name   | Member | MemberType | Date       | ServiceExpense | ProductExpense | TotalExpense |
      | Brian2 | FALSE  |            | 07/01/2022 |                | 860.99         | 860.99       |

  Scenario Outline: khach hang khong phai thanh vien chi dung service
    Given Khach hang la <MemberType>
    When Tinh tong <ServiceExpense> va <ProductExpense>
    Then Tong chi phi bang <TotalExpense>
    Examples:
      | Name   | Member | MemberType | Date       | ServiceExpense | ProductExpense | TotalExpense |
      | Brian  | FALSE  |            | 07/01/2022 | 899.99         |                | 899.99       |


  Scenario Outline: khach hang khong phai thanh vien mua ca san pham va service
    Given Khach hang <MemberType> vua mua san pham vua dung service
    When Tinh tong <ServiceExpense> va <ProductExpense>
    Then Tong chi phi bang <TotalExpense>
    Examples:
      | Name   | Member | MemberType | Date       | ServiceExpense | ProductExpense | TotalExpense |
      | Jame   | FALSE  |            | 10/10/2021 | 499.99         | 349.99         | 849.98       |

  Scenario Outline: khach hang khong phai thanh vien mua ca san pham va service Test
    Given Khach hang <MemberType> vua mua san pham vua dung service CCCCC
    When Tinh tong <ServiceExpense> va <ProductExpense> CCCCC
    Then Tong chi phi bang <TotalExpense> CCCCC Test AAAAAAAAA 123
    And THem khong co gi la khong the
    Examples:
      | Name   | Member | MemberType | Date       | ServiceExpense | ProductExpense | TotalExpense |
      | Jame   | FALSE  |            | 10/10/2021 | 499.99         | 349.99         | 849.98       |
