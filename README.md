# :traffic_light: Traffic Light Model
The Traffic Light Model allows the treatment of local governments differently according to major infection indices and decides on a policy to better cope with the crisis on the local level.
Please find more about this model on our website: https://corona.health.gov.il/en/ramzor-model.

A vaccination certificate is a part of our strategy for the COVID-19 fight and a part of the Traffic Light Model.
We decided to post our vision of the digital solution for vaccination certificates and appreciate any feedback.


# :flight_departure: Global Safe Travel Solution


## Background

Currently there is a lack of international standards for safe travel
policy or appropriate measures approved by either WHO (World Health
Organization) or by any other formal standards body. Recognizing the
fact of the significantly higher vaccination level in the State of
Israel than in other countries, we propose our ground rules as a
baseline for the global standard for safe international travel. We hope
that this proposal can help frame the conversation around the
combination of travel documents (passport) and medical documents
(vaccination certificate) with regards to safe passage.

This document is a result of our work during the first eight weeks of
2021. It is based on research, meetings with different countries,
consultation with other ministries, including population registry and a
wide range of industry experts. Thus far, our conversations yielded an
understanding between the State of Israel and the Governments of Greece
and Cyprus that includes an agreed upon technical solution framework .

The Health System of Israel

Health services in Israel are provided in the community through four
HMOs and through hospitals and private medical centers. The Ministry of
Health has deployed a dedicated data collection protocol and has the
exclusive authority to manage and issue the Standardized COVID-19
Vaccination Certificate. The same policy was applied for Certificates of
Recovery. Whereas the four HMOs administer COVID-19 tests as well as
determine recovery status – the certificate is issued by MoH
exclusively.

That policy has enabled MoH to ensure and enforce a particular method,
design, and safety protocol, as well as a centralized and simplified
authentication procedure for the certificates issuance and delivery. We
understand that some other states have deployed different mechanisms.

# 

## Components of a Global Solution

As outlined in EU council conclusion and eHealth Network guidelines on
basic interoperability elements for proof of vaccination there are
several components required to enable global interoperability:

1.  **Minimum dataset**

> Demographic and vaccination data required to validate vaccination
> certificate ownership and compliance of a particular vaccination type
> with local public health policy.

2.  **Authenticity validation**

> A way to validate that vaccination certificate was issued by a
> specific trusted authority and that it is unaltered.

3.  **Trust framework**

> A framework to enable trust between multiple authorities issuing
> vaccination certificates. This framework should enable unilateral and
> bi-lateral trust based on direct agreements between relevant
> authorities – to facilitate short-term solutions and set the
> foundation for long-term solution that will enable multilateral trust
> without requiring direct engagement between all parties.

Our proposed solution provides all necessary data as defined in EU
minimum dataset guidelines while preserving privacy, enables strong
cryptographic validation of authenticity and can accommodate both
bi-lateral and multi-lateral models.

Specifically – For initial bi-lateral agreements, both recognized
entities would provide their public keys to each other – to enable
validation.

For future, multi-lateral agreements:

1.  Each state will deliver a list of acknowledged entities the
    government recognizes as entitled to issue certificates to a central
    authority

2.  The members of the 'framework of trust' will share their public key
    to enable validation of the certificates issued by recognized
    entities

3.  The members of the 'framework of trust' will be able to retrieve the
    certificates of trusted entities from a central authority.

It is clear that “Framework of trust” approach will be required to
enable scalable and reliable solution in the future, and we are closely
monitoring progress of the running pilots (e.g. Estonia) and
participating in discussions with WHO.

We believe that it is possible and necessary to enable the short-term
solution to facilitate economic recovery and gather valuable insight
from the field to enrich a long-term solution. Accordingly, our solution
also supports a rapid, bilateral-trust approach.

## International efforts

After discussing the topic with multiple countries, we can divide the
approaches taken by our peers into two broad categories:

1.  **Centralized**

> Countries that adopted centralized approach (e.g. – UK, Greece) are
> only distributing vaccination certificate ID and provide online
> validation capabilities that allow proof of ownership and
> authenticity. To address equality issues this approach supports
> validation without digital means through call-center. This approach
> simplifies management and revocation of certificates but requires
> additional complexity to prevent tracking and ensure adequate privacy.

2.  **Distributed**

> Countries that are considering distributed approach (e.g. –
> Netherlands) are encoding minimum dataset inside the certificate along
> with a signature to enable offline cryptographic validation. This
> approach alleviates equality and tracking concerns as well as privacy
> issues but requires additional mechanisms to enable revocation and
> management of certificates in rapidly changing playfield.

Each country has a unique combination of privacy laws and regulations,
international agreements and cultural characteristics that have to be
taken into account while choosing an approach, so there is unlikely to
be a universal, one-size-fits-all solution.

However, we believe that our approach provides a good balance between
different tradeoffs. The solution provides strong offline capabilities
with minimal dataset embedded in the certificate along with digital
signature for validation. At the same time, it provides a mechanism for
revocation of batches of certificates while still avoiding tracking.
Finally, we are able to accommodate online validation scenarios and
enable simplified vaccination certificates management.

## International Travel Documents Specification

The Ministry of Health considers a vaccination certificate to be a
medical record. As a medical record, the certificate should be aligned
with international Health Authorities' standards and regulations.
Currently, there are a few recommendations (published or not) for the
creation of a vaccination certificate that would be internationally
recognized. The Ministry of Health is trying to adopt those
recommendations during the design process of the first publicly
available digital vaccination certificate in the world.

There are existing standards and protocols which define international
documents. One of them is Doc 9303 (by ICAO) that establishes standards
for Machine Readable Travel Document (MRTD) and Electronic Machine
Readable Travel Document (eMRTD). ICAO created those standards for
personal identity documents, with very high physical security
requirements and a particular dataset that must be presented on those
documents. We believe that the vaccination certificate cannot and should
not be designed according to MRTD and eMRTD specifications.

However, the new Digital Travel Credential concept published during 2020
by ICAO addresses very similar issues. While we cannot fully apply the
specifications because of the data and security gaps, we could apply
some of the guidelines to ensure high security and privacy levels of
vaccination certificates. The verification solution we designed for the
vaccination certificate is very similar to the one was suggested by
ICAO.

## Green Pass and Discrimination Prevention

"GreenPass" is a domestic version of the certificate that is designed to
allow access to various public activities and venues regulated by public
health policy. The Green Pass Certificate is issues to the following
groups:

1.  Those who received two doses of vaccination – in this case the Green
    Pass Certificate is set to be valid for 6 months beginning from the
    7-th day after the second vaccine dose.

2.  Those who recovered – in this case the Green Pass Certificate is
    currently set to be valid until 30/6/2021 regardless of recovery
    date.

3.  Those who were tested and found negative to COVID – in this case the
    Green Pass is set to be valid for 72 hours from issuance of the test
    result record. 

This framework allows all population groups in State of Israel to access
any public activities, preventing any kind of discrimination and keeping
privacy of Green Pass holders safe.

## Purpose and Considerations

"Vaccination Certificates" as well as "Recovery Certificates" are
expected to be required for admitting a traveler to the country (with no
mandatory quarantine measures) to ensure the safety of the local
population. However, we are committed to consider the following:

1.  Certificate verification compliance in parallel with abuse and
    forgery prevention.

2.  Operational and maintenance simplicity to provide a smooth flow
    through border control or other checkpoints.

3.  Allowing travelers (as well as locals) access to all activities and
    locations inside the country regulated by GreenPass / Certificate. 

4.  Ensuring the privacy and safety of travelers’ medical information.

## Israel Vaccination Certificate

The Israeli Vaccination Certificate includes demographic information in
English and Hebrew, vaccination information about both first and second
doses and validity dates. The information is provided in both -
human-readable form - printed on the certificate and in machine-readable
form - encoded in QR code.

The QR Code is readable by any optic scanning device (e.g. smartphone).
It includes an industry-standard cryptographic signature that allows
content verification using an accessible X.509 public key and revocation
list (according to published technical specifications). The
cryptographic signature is aligned with JWS standards using any
supported JWS algorithms (RSA256, PSA256, ES256). It enables a
high-security level and low risk of forgery (though such risk exists and
cannot be 100% eliminated). 

## Border Crossing Process Use Cases : Israel 

There are two different processes for two different situations: 

1.  The traveler was vaccinated or deemed recovered in Israel.

2.  The situation when the Israeli Border Control Authorities has no
    information regarding the traveler, specifically, his/her
    epidemiological status. This scenario includes Israeli citizens and
    foreigners who were vaccinated abroad or were deemed recovered in
    foreign countries. 

Solution for travelers of use case "1":

The Immigration Services will have access to a minimal subset of MoH
Covid19 vaccination and recovery records indicating status of travelers
that were vaccinated or recovered in Israel.

Solution for travelers of use case "2":

To allow a fast border cross by the foreign travelers, there are four
discrete steps:

1.  Passengers must provide a vaccination/recovery certificate that
    includes demographic information that can be compared to the
    holder's passport and sufficient vaccination information.

2.  Provided certificate must be issued and verifiable by trusted issuer
    (e.g. Ministry of Health or another Authorized Institution In
    country of origin).

3.  The demographic information on the certificate must be compatible
    with traveler’s identity based on an official ID (i.e., passport).

4.  Vaccination information will be evaluated according to the current
    public health policy for determining the entry protocol.

To illustrate: The passenger will be required to fill out an online form
before the flight and provide vaccination information (by uploading an
appropriate certificate or by providing a Certificate ID). The provided
information will be validated with the issuer country (either by
validating cryptographic signature or using pre-approved online web
service) and cross-referenced with demographic details and public health
policy <u>before boarding the flight.</u> In case passenger
epidemiologic status does not comply with Israel’s requirements a clear
indication will be provided to avoid overload and stress on border
control

l\. At the border crossing the traveler will present a passport and his
/ her demographic details will automatically be compared with
pre-verified information, allowing the border control authority to get a
clear indication if the passenger is allowed to enter.


## Rules of Entry

Rules of entry will be based on public health policy and regulation of
the destination country. Among regulations and protocols on entry
(isolation, tests, etc.), the following information may be considered:

-   Vaccine type 

    -   Administration protocol

    -   Period between doses

<!-- -->

-   Countries visited before arrival to Israel 

-   Recovery Date

-   COVID-19 test date and results 

## Physical security of vaccination certificates

We are considering providing secure printing technologies and special
materials to secure printed vaccination certificates physically as an
additional activity to prevent a fraud and enhance a level of
protection.

## Privacy 

The proposed solution enables offline verification that prevents an
individual tracking scenario. Furthermore, the presence of the private
information within the document, means that this information remains
with the owner exclusively (as opposed to a web-service concept that may
allow to track Certificate’s holder)

## Forgery Prevention 

The solution is based on industry-standard cryptographic signatures that
provide proven protection against forgery.

## Advantages for proposed process

The proposed solution offers a secure and reliable cross-border flight
mechanism with minimal impact on passengers (including completely
paperless processes) and minimal expansions required from existing
infrastructure. In summary, the proposed solution provides a mechanism
for verifying passenger eligibility **prior to boarding** and thus
reducing overhead and financial losses to airline operators.

## Technology 

Israeli QR code format:

1.  QR code is encoded in 8-bit mode with H level of error correction.

2.  The payload starts with the encoded content as following:

    1.  The payload is a single ”vcert.json” file, serialized and
        archived as standard zip in binary expression.

    2.  Sample JSON file and field explanation provided below

    3.  JSON data field names were minimized and not semantically
        comprehensible, because of compliance to minimum character
        volume requirement as a consequence of a stricted physical QR
        Code dimensions. 

    4.  JSON file must include a field that indicates the algorithm used
        for a cryptographic signature

3.  Last 256 bytes of the payload is a cryptographic signature in binary
    expression (key size is fixed at 2048)

<!-- -->

1.  Currently, we are using RSA256, but any of the standard JWS/JWT
    algorithms can be used (i.e., PSA256 or ES256) as long as it's 256
    bytes long

<!-- -->

4.  QR Code verification is based on an optical scanner/reader with
    computing unit (e.g. smartphone, tablet etc.) that should run
    process which insure data integrity of the payload related to its
    digital signature, using the MoH public key.

5.  As a part of control enhancement of the Certificate validity
    timeframe, IL MoH will also publish a daily updated Certificate Revocation List.

<!-- -->

2.  Revocation list will be based on two kinds of batch numbers – a coarse
    batch and a fine batch number. In cases where one or more batch
    numbers appears in the published revoke list then the official MoH
    App will recognize these batch related Certificates as invalid.

<!-- -->

6.  According to our tests, the binary data size obtained (before
    transforming into QR) is around 900 bytes, allowing reliable scans
    from mobile phone screens as well as from plain paper printed in the
    physical QR size of \~ 4x4 cm.

Validation flow:

1.  Flow 1 - online

<!-- -->

1.  Scan QR code and submit its entire contents as a binary blob to IL
    MoH validation API. The API will check the validity of the signature
    and revocation lists and will return the JSON payload of the
    certificate along with a valid/invalid indication.

2.  Once the payload is deemed valid, compare the identifying
    information in the payload (id, passport number, date of birth,
    first and last name, etc.) with a photo ID or another identifying
    document.

<!-- -->

1.  Flow 2 - offline

    1.  Download IL MoH public key and periodically download revocation
        lists

    2.  Scan QR code, extract the payload according to the process
        above, and validate the signature with IL MoH public key
        according to the algorithm specified in the payload and check
        coarse and fine batch numbers against revocation lists. 

    3.  Once the payload is deemed valid, compare the identifying
        information in the payload (id, passport number, date of birth,
        first and last name, etc.) with a photo ID or another
        identifying document.

## Unique Vaccination Certificate Identifier (UVCI) Composition

1.  Step1 – Opaque Unique String Calculation

    1.  The Unique string calculated as MD-5 hash function based on data
        fields from MoH“CoVID-19 Vaccination Record”. The subject is
        organized into a single plaintext string as follows:

MD5=(\[PII Information\]\[Valid until date\])

2.  Step2 – Checksum Calculation

    1.  The UVCI to be finalized by CRC32 checksum calculation followed
        by addition of Version and country prefix ahead of Opaque Unique
        String.

    2.  Version prefix refers to the version of the UVCI schema. The
        version prefix is ‘01’ for this version; the version prefix is
        be composed of two digits.

    3.  Country prefix is country code is specified by ISO 3166-1.
        Longer codes (e.g. 3 characters and up (e.g ‘UNHCR’) are
        reserved for future use.

    4.  All prefixes are to be separated by slash “/” character from
        each other.

    5.  The checksum must be separated from rest of the UVCI by a “\#”
        character.

UVCI = \[**01**\]**/**\[**IL**\]**/**MD5{\[PII Information\]\[Valid
until date\]}**\#**\[**crc32**\]

UVCI Example:

**01/IL/**1532F4ED22C0BE2BF30540947C93D322**\#74D0CC9A**

## Minimal Dataset

| JSON filed name | Field Name                                       | Sample Data                                      | Comments                                                                                                                   |
|-----------------|--------------------------------------------------|--------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|
| id              | Vaccination Certificate ID                       | UVCI |                                                                                                                            |
| et              | Signature Algorithm                              | 1                                                | 1 stands for RS256 (in the future you can declare ne)                                                                      |
| c               | Certificate Issuing Authority                    | IL MOH                                           |                                                                                                                            |
| ct              | Certificate Type                                 | 1                                                | Indicates type of certificate (1=GreenPass,2=Vaccination,3=Recovery)                                                       |
| cn              | Vaccination Certificate Batch Number (coarse)    | 123456789                                        | Coarse issuing batch number for the certificate (can be used for revocation), not to be confused with vaccine batch number |
| fn              | Vaccination Certificate Batch Number (fine)      | 123456789                                        | Coarse issuing batch number for the certificate (can be used for revocation), not to be confused with vaccine batch number |
| g               | Given Name                                       | Miriam                                           |                                                                                                                            |
| f               | Family Name                                      | Wechsler Lindenfeld                              |                                                                                                                            |
| gl              | Localized Given Name                             | <span dir="rtl">מירים</span>                     |                                                                                                                            |
| fl              | Localized Family Name                            | <span dir="rtl">וקסלר לינדנפלד</span>            |                                                                                                                            |
| idl             | Citizen ID                                       | 208067356                                        | citizen identification card number (<span dir="rtl">ת.ז</span>.)                                                           |
| idp             | Passport Number                                  | 57738870                                         |                                                                                                                            |
| b               | Date of Birth                                    | 1994-11-15                                       | Complete date, without time, following ISO 8601                                                                            |
| e               | Certificate Expiration Date                      | 2030-09-19                                       | Complete date, without time, following ISO 8601                                                                            |
| a               | Innoculated Since Date                           | 2020-09-19                                       | Complete date, without time, following ISO 8601                                                                            |
| d1/d            | Dose 1 - Date                                    | 2020-08-12                                       | Complete date, without time, following ISO 8601                                                                            |
| d1/vv           | Dose 1 - Vaccine vendor                          | Pfizer                                           | Human readable name of vaccine manufacturer                                                                                |
| d1/vt           | Dose 1 - Vaccine type                            | Covid19                                          | Human readable name of vaccine                                                                                             |
| d1/vb           | Dose 1 - Vaccine batch number                    | BNT162b2                                         |                                                                                                                            |
| d1/vc           | Dose 1 - Vaccine Code                            | 208                                              | CDC CVX (https://www2a.cdc.gov/vaccines/iis/iisstandards/vaccines.asp?rpt=tradename)                                       |
| d1/o            | Dose 1 - Vaccinating Organization Name           | Maccabi                                          |                                                                                                                            |
| d1/ol           | Dose 1 - Localized Vaccinating Organization Name | <span dir="rtl">קופ''ח מכבי</span>               |                                                                                                                            |
| d1/oc           | Dose 1 - Vaccinating Organization Code           | 103                                              |                                                                                                                            |
| d1/c            | Dose 1 - Vaccinating Country                     | ISR                                              | ISO 3166 Country                                                                                                           |
| d2/d            | Dose 2 - Date                                    | 2020-09-12                                       | Complete date, without time, following ISO 8601                                                                            |
| d1/vv           | Dose 2 - Vaccine vendor                          | Pfizer                                           | Human readable name of vaccine manufacturer                                                                                |
| d1/vt           | Dose 2 - Vaccine type                            | Covid19                                          | Human readable name of vaccine                                                                                             |
| d1/vb           | Dose 2 - Vaccine batch number                    | BNT162b2                                         |                                                                                                                            |
| d1/vc           | Dose 2 - Vaccine Code                            | 208                                              | CDC CVX (https://www2a.cdc.gov/vaccines/iis/iisstandards/vaccines.asp?rpt=tradename)                                       |
| d1/o            | Dose 2 - Vaccinating Organization Name           | Maccabi                                          |                                                                                                                            |
| d1/ol           | Dose 2 - Localized Vaccinating Organization Name | <span dir="rtl">קופ''ח מכבי</span>               |                                                                                                                            |
| d2/oc           | Dose 2 - Vaccinating Organization Code           | 103                                              |                                                                                                                            |
| d2/c            | Dose 2 - Vaccinating Country                     | ISR                                              | ISO 3166 Country                                                                                                           |
